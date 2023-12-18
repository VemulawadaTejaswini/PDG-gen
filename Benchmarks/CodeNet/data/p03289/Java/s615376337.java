import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        String text = scn.next();
        int waFlag=0;
        int acFlag=0;
        for(int i=0;i<text.length();i++){
            char buf = text.charAt(i);
            if(Character.isUpperCase(buf)){
                if(i==0&&buf!='A'||i==text.length()-1){
                    waFlag++;
                }
                if(i>1&&buf=='C'){
                    acFlag++;
                }
            }
        }
        if(waFlag==0&&acFlag==1){
            System.out.println("AC");
        }else {
            System.out.println("WA");
        }
    }
}
