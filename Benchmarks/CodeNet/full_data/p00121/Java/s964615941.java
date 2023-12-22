import java.util.*;

/**
 * Created by chinalife on 2019/7/31.
 */
public class Main{

    public static Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        bfs();
        while(scanner.hasNext()){
            String input = scanner.nextLine();
            input = input.replaceAll(" ","");
            int result = map.get(input);
            System.out.println(result);
        }
    }
    public static void bfs(){
        String s = "01234567";
        map.put(s,0);
        int[] direction = new int[]{1,-1,4,-4};
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()){
            String curr = queue.poll();
            int index = findZeroIndex(curr);
            int value = map.get(curr);
            for(int i = 0;i<direction.length;i++){
                int newIndex = index+direction[i];
                if(index == 3 && i == 0){
                    continue;
                }
                if(index == 4 && i == 1){
                    continue;
                }
                if(newIndex <0 || newIndex>=8){
                    continue;
                }
                String temp = swap(curr,index,newIndex);
                if(!map.containsKey(temp)){
                    map.put(temp,value+1);
                    queue.add(temp);
                }
            }
        }
    }
    public static int findZeroIndex(String s){
        int index = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                index = i;
                break;
            }
        }
        return index;
    }
    public static String swap(String curr,int index,int newIndex){
        char[] chars = curr.toCharArray();
        char temp = chars[index];
        chars[index] = chars[newIndex];
        chars[newIndex] = temp;
        return new String(chars);
    }
}

