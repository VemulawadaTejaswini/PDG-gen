import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b= new int[a];
        int con;

        for(int k=0;k<a;k++){
             b[k] = sc.nextInt();
        }

        for (int i = 0; i < a/2; i++) {
            con = b[i];
            b[i]=b[a-i-1];
            b[a-i-1]=con;
        }
        for(int j=0;j<a;j++){
           if(j<a-1){
            System.out.print(b[j]+" ");
         }
         if(j==a-1){
                System.out.println(b[j]);
            }
        
        }
        sc.close();

    }  
}
