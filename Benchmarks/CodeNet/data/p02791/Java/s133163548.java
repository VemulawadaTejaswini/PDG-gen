import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int[] P =new int[N];
    for(int i=0;i<N;i++){
        P[i]=sc.nextInt();
    }
    sc.close();
    int count = 0;
    for(int i=0;i<N;i++){
        int flg=0;
        for(int j=0;j<i;j++){
            if(P[i]>P[j]){
                break;
            }
        }
            count=count+1;
        
    } 
    
    System.out.println(count);
}
}