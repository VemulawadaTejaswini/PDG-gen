import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<Integer> candy = new ArrayList<Integer>(){
            {
                add(Integer.parseInt(sc.next()));
                add(Integer.parseInt(sc.next()));
                add(Integer.parseInt(sc.next()));
            }
        };
        
        Collections.sort(candy, Comparator.reverseOrder());
        
        if(candy.get(0) == candy.get(1) + candy.get(2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}