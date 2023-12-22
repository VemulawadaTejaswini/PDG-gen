import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();
        String []a=new String[x];
        int count=0;

        for(int i=0; i<x; i++){
            a[i]=stdIn.next();
        }
        for(int i=0; i<x-1; i++){
            for(int j=1; j<x-i; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>i+2){
                count=i+1;
            }
        }

        System.out.println(x-count);
        
    }

}