import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int H = sc.nextInt(); 
        int W = sc.nextInt();
        int i,j;
        while (H!=0 || W!=0) {  
            for(i=0;i<H;i++){ 
                for(j=0;j<W;j++){ 
                    if((i%2==0 && j%2==0)||(i%2==1 && j%2==1)){ 
                    System.out.print("#"); 
                    }else{ 
                    System.out.print("."); 
                    } 
                } 
                System.out.print("\n"); 
            } 
            System.out.print("\n"); 
            H = sc.nextInt(); 
            W = sc.nextInt(); 
        } 
    } 
}
