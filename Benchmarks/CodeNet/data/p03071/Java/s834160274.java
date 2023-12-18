import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a_button=scn.nextInt();
        int b_button=scn.nextInt();
        int total=0;
        for(int i=0;i<2;i++){
            int compare=a_button-b_button;
            if(compare>=0){
                total+=a_button;
                a_button--;
            }else{
                total+=b_button;
                b_button--;
            }
        }
        System.out.println(total);
    }
}