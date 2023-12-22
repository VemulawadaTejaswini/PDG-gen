import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int x=stdIn.nextInt();//回数

        String []a=new String[x];
        for(int i=0; i<a.length; i++){
            a[i]=stdIn.next();
        }
        int sum=0;
        for(int i=0;i<x; i++){
            for(int j=0; j<x-i-1; j++){
                if(a[i].equals(a[i+j+1])){
                    sum++;
                }
            }
        }
        System.out.println(x-sum);
        
    }

}