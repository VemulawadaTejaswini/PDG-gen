import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();

        int []a=new int[x-1];
        for(int i=0; i<x-1; i++){
            a[i]=stdIn.nextInt();
        }
        int []b=new int[x];
        for(int i=0; i<x; i++){
            b[i]=0;
        }
        for(int i=0; i<x-1; i++){
            for(int j=0; j<x-1; j++){
                if(a[j]==i+1){
                    b[i]++;
                }
            }
        }
        System.out.println();
        
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
            
        }
    }

}