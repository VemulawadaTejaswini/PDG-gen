import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String args[] ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] origin = br.readLine().split("");
        String[] serch = br.readLine().split("");
        int plusi = PlusI(serch);

       // System.out.println( SameString(serch) );
        for(int i = 0; i < origin.length; ){
        	 //System.out.println(i);

           if( i + serch.length  <= origin.length && SearchWord(origin , serch, i)){
              System.out.println(i);
              //i++;


              if(SameString(serch)){
            	  i = i + plusi ;
              }else{
                i++;
              }
           }else{

        	   i++;

           }



        }







    }


    public static int PlusI(  String[] Serch ){


    	for(int j = 0; j < Serch.length; j++ ){

    	    if( Serch[j].equals(Serch[0]) && 0 < j){
    	    	return j;
    	    }

    	}


        return Serch.length;


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


    public static boolean SameString(String[] Serch ){


    	boolean SerchCheck = false;
    	for(int i = 0 ; i < Serch.length; i++){

    	    if( Serch[0].equals(Serch[i]) ){
    	    	SerchCheck = true;
    	    }
    	    else{
    	    	return false;
    	    }



    	}


    	return SerchCheck;

    }



}