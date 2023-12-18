import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        String text = scn.next();
        int waFlag=0;
        int acFlag=0;
        for(int i=0;i<text.length();i++){
            char buf = text.charAt(i);
            if(i==0&&buf!='A'){
               waFlag++;
            }else if(i==text.length()-1&&buf=='C'){
                waFlag++;
            }else if(1<i&&i<text.length()-1){
                 if(buf=='C'){
                    acFlag++;
                }else if(Character.isUpperCase(buf)){
                    waFlag++;
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
