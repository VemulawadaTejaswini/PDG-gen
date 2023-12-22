import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int i, j ,k;
        int [] h, w;
        h = new int[300];
        w = new int[300];
        
        while(true){
            h[cnt] = sc.nextInt();
            w[cnt] = sc.nextInt();
            if(h[cnt] == 0 || w[cnt] == 0)
                break;
            cnt++;
        }

        for(i=0; i<cnt; i++){
            for(j=0; j<h[i]-1; j++){
                if(j == 0){
                    for(k=0; k<w[i]-1;k++)
                        System.out.print("#");
                }else{
                    for(k=0; k<w[i]-1; k++){
                    if(k==0)
                        System.out.print("#");
                    else    
                        System.out.print(".");
                    }   
                }
                System.out.print("#\n");                           
            }
            for(k=0; k<w[i]; k++)
                System.out.print("#");
            System.out.print("\n");
            System.out.println("");
        }
    sc.close();
    }
}
