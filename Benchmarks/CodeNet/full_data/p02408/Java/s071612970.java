import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String str = br.readLine();
                    str =br.readLine();

                    ArrayList<String> cards = new ArrayList<String>();
                    
                    while(str != null){
                    cards.add(str);
                    str = br.readLine();
                    }    

                    ArrayList<String> empty = new ArrayList<String>();

                    for(int i=1;i<=13;i++){
                        String s = "S " +i;
                                                
                        if(cards.indexOf(s) == -1){
                            empty.add(s);
                        }
                            
                    }

                    for(int i=1;i<=13;i++){
                       
                        String h = "H " +i;
                       
                        if(cards.indexOf(h) == -1){
                            empty.add(h);
                        }
                    }

                    for(int i=1;i<=13;i++){

                        String c = "C " +i;

                        if(cards.indexOf(c) == -1){
                            empty.add(c);
                        }
                    }

                        for(int i=1;i<=13;i++){
         
                            String d = "D " +i;
                            
                            if(cards.indexOf(d) == -1){
                                empty.add(d);
                            }                        
                        }     
                    
                    for(int i=0;i<empty.size();i++){
                        System.out.println(empty.get(i));
                    }
}
}