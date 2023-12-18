import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split("");
        int count = 1;
        for(int i = 0; i < n - 1; i++){
            if(!line1[i].equals(line1[i + 1]))   count++;
        }
        
        
        
        System.out.println(count);
    }
}