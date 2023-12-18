import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int notes = Integer.parseInt(input.substring(0,input.indexOf(" ")));
        input = input.substring(input.indexOf(" ") + 1);
        int money_l = Integer.parseInt(input);
        int money = money_l/1000;
        String result = "-1 -1 -1";


        if(notes<=money && money<=notes*10){//too much notes or too much mooney
            OUTSIDE:for(int x = 0; x<=notes; x++){
                if(x*10>money){break;}
                if(money <= x*10 + (notes-x)*5){
                    for(int y = 0; y<=notes-x; y++){
                        if(x*10 + y*5 > money){break;}
                        if(x*10 + y*5 + (notes-x-y) == money){
                            result = String.valueOf(x) + " " + String.valueOf(y) + " " + String.valueOf(notes-x-y);
                            break OUTSIDE;
                        }
                    }
                }
            }
        }
    System.out.println(result);
    }
}