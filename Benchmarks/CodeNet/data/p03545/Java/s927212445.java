import java.util.Scanner;

public class Main {
    public Scanner in=new Scanner(System.in);
    public int[] inputNum=new int[4];
    public String outputNum;
    public String[] cc={"+","-"};

    public static void main(String args[]){
        Main m=new Main();

        for(int i=0;i<4;i++){
            m.inputNum[i]=m.in.nextInt();
        }

        if(m.inputNum[0]+m.inputNum[1]+m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"+"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]+m.inputNum[1]+m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"+"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]+m.inputNum[1]-m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"-"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]+m.inputNum[1]-m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"-"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]-m.inputNum[1]+m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"+"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]-m.inputNum[1]+m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"+"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]-m.inputNum[1]-m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"-"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
        }
        if(m.inputNum[0]-m.inputNum[1]-m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"-"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
        }
    }
}
