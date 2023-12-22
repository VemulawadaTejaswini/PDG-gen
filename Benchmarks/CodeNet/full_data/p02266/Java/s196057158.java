import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    final char[] inputs = sc.nextLine().toCharArray();
    int map[] = new int[inputs.length + 1];
    int maps[] = new int[inputs.length + 1];
    
    int i;
    int total_areas = 0;
    
    // convert the input to -1 or 0 or 1
    for(i = 0; i < inputs.length; i++){
        map[i] = inputs[i] == '/' ? 1 : inputs[i] == '_' ? 0 : -1;
    }
    for(i = 0; i < inputs.length; i++){
        //System.out.print(map[i] + " ");   
    }
    //System.out.println();
    
    //maps shows the height
    for(i = 0; i < inputs.length; i++){
        maps[i+1] = map[i];
    }
    for(i = 0; i < inputs.length; i++){
        maps[i+1] += maps[i];
    }
    for(i = 0; i < inputs.length; i++){
        //System.out.print(maps[i] + " ");
    }
    //System.out.println();
     
    
    LinkedList<Integer> area_list = new LinkedList<Integer>();
    
    //check the elements of maos
    for(int cur_pos = 0; cur_pos < inputs.length; cur_pos++){
        int cur_height = maps[cur_pos];
        
        //check the water area
        int areas = 0;
        boolean ok = false;
        for(int next_pos = cur_pos + 1; next_pos < inputs.length; next_pos++){
            int prev_height = maps[next_pos - 1] - cur_height;
            int next_height = maps[next_pos] - cur_height;
            int max_height = Math.abs(Math.max(prev_height, next_height));
            
            if(next_height <= 0){
                areas += max_height;
                if(prev_height < next_height){
                    areas += 1;
                }
            }
            
            if(next_height >= 0){
                cur_pos = next_pos - 1;
                ok = true;
                break;
            }
        }
        
        if(ok && areas > 0){
            total_areas += areas;
            area_list.add(areas);
        }
    }
    
    System.out.println(total_areas);
    System.out.print(area_list.size());
    
    for(int area : area_list){
            System.out.print(" " + area);
        }
        System.out.println();
    }

}

