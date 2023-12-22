import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int x=stdIn.nextInt();
        String []a=new String[x];
        int num=x;
        for(int i=0; i<x; i++){
            a[i]=stdIn.next();
        }
        System.out.println();
        
        for(int i=0; i<x; i++){
            System.out.println(a[i]);
            
        }
        for(int i=0; i<x-1; i++){
            for(int j=1; j<x-i; j++){
                if(a[i]==a[j]){
                    num--;
                }
            }
        }
        System.out.println(num);
        
    }

}