import java.util.Scanner;

class practic{

    public static void main(String[] args){


        Scanner scanNum = new Scanner(System.in);

        String inputNum = scanNum.next();


        char[] charArray = inputNum.toCharArray();

        for(int i=0,j=0; i < inputNum.length() ; i++){
            if(charArray[i] == '1'){
                charArray[i] = '9';
            }
            else{
                charArray[i] = '1';
            }
        }

        System.out.print(charArray.toString());
    }
}
