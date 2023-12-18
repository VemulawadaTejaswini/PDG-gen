import java.util.*;

public class Main {    

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);                                               
        
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("2",1);        
        map.put("3",2);        
        map.put("4",3);
        map.put("5",4);
        map.put("6",5);
        map.put("7",6);
        map.put("8",7);
        map.put("9",8);
        map.put("10",9);
        map.put("11",10);        
        map.put("12",11);
        map.put("13",12);
        map.put("1",13);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int Alice = map.get(String.valueOf(A));
        int Bob   = map.get(String.valueOf(B));
        
        if(Alice == Bob){
            System.out.println("DRAW");
        }else if(Alice > Bob){
            System.out.println("Alice");
        }else if(Bob > Alice){
            System.out.println("Bob");
        }
                                                                        
    }      
    
}
        
        
        
        
        