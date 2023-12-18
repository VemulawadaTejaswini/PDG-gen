import java.util.Scanner;

final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int bigCounter = 0;
        int n = stdIn.nextInt();
        String s = stdIn.next();
        stdIn.close();
        char [] charArray = s.toCharArray();
        int [] procedureCode = new int [n+1];
        procedureCode[0] = 1;

        do{
            Outer:{
                String madeString = "";
                for(int i=0; i<charArray.length; i++){
                    if(procedureCode[i] == 1){
                        madeString += charArray[i];
                    }
                }
                for(int i=0; i<madeString.length()-1; i++){
                    for(int j=i+1; j<madeString.length(); j++){
                        if(madeString.charAt(i) == madeString.charAt(j)){
                            break Outer;
                        }
                    }
                }
                bigCounter++;
            }
            
            procedureCode[0]++;
            for(int i=0; i<procedureCode.length-1; i++){
                if(procedureCode[i] == 2){
                    procedureCode[i+1]++;
                    procedureCode[i] = 0;
                }
            }
        }while(procedureCode[procedureCode.length-1] != 1);

        System.out.println(bigCounter);
    }
}
