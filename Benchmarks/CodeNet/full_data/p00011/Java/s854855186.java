import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
            int w = sc.nextInt();
            int n = sc.nextInt();
            int[] stick = new int[w];
            for(int i = 0; i < stick.length; i++){
                stick[i] = i + 1;
            }
            
            int a, b;
            
            for(int i = 0; i < n; i++){
                String line = sc.next();
                String[] num = line.split(",");
                a = Integer.parseInt(num[0])-1;
                b = Integer.parseInt(num[1])-1;
                int tmp = stick[a];
                stick[a] = stick[b];
                stick[b] = tmp;
            }

            for(int i = 0; i < stick.length; i++){
                System.out.println(stick[i]);
            }
        
    }
}
