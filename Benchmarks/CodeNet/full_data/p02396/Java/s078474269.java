import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = scanner.nextInt();
            if(x != 0){
                array.add(x);
            }else{
                break;
            }
            
        }
        for(int j=0; j < array.size(); j++){
            System.out.println("Case "+ (j+1) + ": " + array.get(j));
        }
    }
}

