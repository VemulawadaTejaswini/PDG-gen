import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a==0) {break;}
            int []scores=new int[a];
            for(int i=0;i<scores.length;i++){
                scores[i] = sc.nextInt();
            } 
        double average=0,variance=0,deviation=0;
        int sum=0;
        for(int j=0;j<scores.length;j++){
            sum=scores[j]+sum;
        }
        average=(double)sum/scores.length;

        for(int k=0;k<scores.length;k++){
            deviation=deviation+(scores[k]-average)*(scores[k]-average);
        }  
            variance=deviation/scores.length;
    
        System.out.println(Math.sqrt(variance));

        }
sc.close();
    }
    
}
