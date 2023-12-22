import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int lamp = Integer.parseInt(sc.next());
            int count = Integer.parseInt(sc.next());

            List<Integer> light = new ArrayList<>();
            List<Integer> light2 = new ArrayList<>();

            for(int i = 0; i < lamp; i++){
                light.add(0);
                light2.add(0);
            }

            for(int i = 0; i < lamp; i++){
                int strong = Integer.parseInt(sc.next());
                for(int j = i - strong; j <= i + strong; j++){
                    if(j >= 0 && j <= lamp - 1) light.set(j, light.get(j) + 1);
                }
            }
            count--;

            boolean useLight2 = true;

            while(count > 0){
                if(useLight2){
                    for(int i = 0; i < lamp; i++){
                        int strong = light.get(i);
                        for(int j = i - strong; j <= i + strong; j++){
                            if(j >= 0 && j <= lamp - 1) light2.set(j, light2.get(j) + 1);
                        }
                    }
                    useLight2 = false;
                }else{
                    for(int i = 0; i < lamp; i++){
                        int strong = light2.get(i);
                        for(int j = i - strong; j <= i + strong; j++){
                            if(j >= 0 && j <= lamp - 1) light.set(j, light.get(j) + 1);
                        }
                    }
                    useLight2 = true;
                }
                count--;
            }

            if(useLight2){
                for(int i = 0; i < lamp; i++){
                    System.out.print(light.get(i));
                }
            }else{
                for(int i = 0; i < lamp; i++){
                    System.out.print(light2.get(i));
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}