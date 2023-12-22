import java.util.Scanner;



public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length()-3;i++){
            for(int j=4;j<str.length()-i+1;j++){
                if ((Double.parseDouble(str.substring(i,j+i)))%2019==0){
                    count++;
                    if (j+4>str.length()){
                        break;
                    }
                    else
                        j=j+3;
                }
            }
        }
        System.out.println(count);


    }
}
