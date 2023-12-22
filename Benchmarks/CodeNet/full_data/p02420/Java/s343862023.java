import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int m = in.nextInt();
        for(int i =0; i < m; i++){
            int n = in.nextInt();
            String ue = str.substring(str.length()-n);
            String sita = str.substring(0,str.length()-n);
            str = ue+sita;                                                  
            //if(i < m+1){
            //System.out.println(str);
            }
        System.out.println(str);


    }
}