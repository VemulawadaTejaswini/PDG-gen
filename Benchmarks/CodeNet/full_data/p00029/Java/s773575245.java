import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
        public static void main(String[] args){
                BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
                String str="";
                String[] tango;
                int tangosu=0;
                int max_length=0;
                try{
                        str=bfr.readLine();
                        tango=str.split(" ");
                        tangosu=tango.length;
                        for(int i=0; i<tangosu; i++){
                                if(tango[max_length].length()<tango[i].length()){
                                        max_length=i;
                                }
                        }
                        int[] toujyoukaisu=new int[tangosu];
                        for(int i=0; i<tangosu; i++){
                                toujyoukaisu[i]=0;
                                for(int j=0; j<tangosu; j++){
                                        if(i!=j){
                                                if((tango[i].toLowerCase()).equals((tango[j]).toLowerCase())){
                                                        toujyoukaisu[i]++;
                                                }
                                        }
                                }
                        }
                        int max=0;
                        for(int i=0; i<tangosu; i++){
                                if(toujyoukaisu[max]<toujyoukaisu[i]){
                                        max=i;
                                }
                        }
                        System.out.println(tango[max]+" "+tango[max_length]);
                }catch(IOException e){
                        System.exit(0);
                }
        }
}
