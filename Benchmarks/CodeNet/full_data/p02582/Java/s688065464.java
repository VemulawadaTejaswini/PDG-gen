import objectdraw.*;
import java.awt.*;

public class RainySeason extends WindowController{
    private String inputString;
    private String[] letters=new String[3];
    private int intToReturn=0;

    public int compute(String S){
        inputString=S;
        for (int count=0;count<3;count++){
            letters[count]=inputString.substring(count,count+1);
        }
        if (inputString.equals("RRR")){
            intToReturn=3;
        }
        else if(inputString.equals("SSS")){
            intToReturn=0;
        } 
        else if (letters[1].equals("S"))    {
            intToReturn=1;
        }
        else if (letters[0].equals("S")&&letters[2].equals("S")){
            intToReturn=1;
        }
        else{
            intToReturn=2;
        }
        return intToReturn;
    }
}