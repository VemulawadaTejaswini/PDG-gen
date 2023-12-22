import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        int h=0,m=0,s=0;
        boolean botan=false;
        
        while(botan==false){
            if(x-3600>=0){
                x-=3600;
                h+=1;
            }
            else botan=true;
        }
        botan=false;
        while(botan==false){
            if(x-60>=0){
                x-=60;
        		m+=1;
  			  }		
            else botan=true;
        }
            System.out.println(h+":"+m+":"+x);
    }
}
