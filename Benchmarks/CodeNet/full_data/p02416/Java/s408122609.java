import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int sum = 0;
            String st = sc.next();
            if(st.equals("0")) break;
            for(int i=0; i<st.length(); i++){
                //System.out.println();
                sum = sum + (st.charAt(i) - '0');
            }
            System.out.println(sum);
        }
        sc.close();
    }
    
}
