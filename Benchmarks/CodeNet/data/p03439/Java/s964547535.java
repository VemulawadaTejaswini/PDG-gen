import java.util.Scanner;

class Main{

    static Scanner scan = new Scanner(System.in);


    //Male:1
    //Female:-1
    static int ask(int i){
        System.out.println(i);
        String s = scan.next();
        if(s.equals("Vacant"))return 0;
        if(s.equals("Male"))return 1;
        return -1;
    }

    public static void main(String[] args){

        int N = scan.nextInt();

        int left=0,right=N;
        int even = ask(0);
        if(even==0)return;

        while(true){
            int center = (left+right)/2;
            int sex=ask(center);
            if(sex==0)return;
            if(center%2==0){
                if(sex==even)left=center;
                else right=center;
            }else{
                if(sex!=even)left=center;
                else right=center;
            }
            
        }
    }
}