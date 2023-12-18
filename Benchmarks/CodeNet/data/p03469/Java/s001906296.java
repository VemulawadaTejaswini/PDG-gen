import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String wrongDate=scn.next();
        for(int i=0;i<wrongDate.length();i++){
            if(i==3) {
                System.out.print(8);
            }else{
                System.out.print(wrongDate.charAt(i));
            }
        }
        System.out.println();
    }
}
