import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String args[] ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] origin = br.readLine().split("");
        String[] serch = br.readLine().split("");


        for(int i = 0; i < origin.length; ){

          if( i + serch.length  <= origin.length){
           if( SearchWord(origin , serch, i) ){
               System.out.println(i);
               i++;
           }else{
             i = i + serch.length;
           }

          }

        }







    }



    public static boolean SearchWord(String[] Origin , String[] Serch , int i){


    	boolean SerchCheck = false;
    	for(int j = i , k = 0; k < Serch.length; j++ , k++){

    	    if( Serch[k].equals(Origin[j]) ){
    	    	SerchCheck = true;
    	    }
    	    else{
    	    	return false;
    	    }



    	}


    	return SerchCheck;

    }


}