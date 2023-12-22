import java.util.Scanner;

class Main {

    public static void main(String[] args) {
       Scanner stdIn=new Scanner(System.in);
       
       int N=stdIn.nextInt();
       int K=stdIn.nextInt();
       int []c=new int[N];
       int count=0;

       
       int []d=new int[K];
       for(int i=0; i<c.length; i++){
           c[i]=0;
       }

       for(int i=0; i<K; i++){
           d[i]=stdIn.nextInt();
           int []a=new int[d[i]];
           for(int j=0; j<d[i]; j++){
                a[j]=stdIn.nextInt();
           }
           for(int k=0; k<d[i]; k++){
                c[a[k]-1]++;
           }
        }
        for(int i=0; i<c.length; i++){
            if(c[i]==0){
                count++;
            }
        }
        System.out.println(count);
        
        
        
    }

}