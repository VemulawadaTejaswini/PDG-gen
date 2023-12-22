import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

class Main{

  public static void main(String[] args){

    BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
    String str="";
    StringTokenizer stk;
    int number,omosa,takasa;
    List<Integer> himan=new ArrayList<Integer>();

    try{

      while(true) {
    	  str=bfr.readLine();
          if(str=="") {
            System.exit(0);
          }
    	  stk=new StringTokenizer(str,",");
          number=Integer.parseInt(stk.nextToken());
          omosa=Integer.parseInt(stk.nextToken());
          takasa=Integer.parseInt(stk.nextToken());

          double bmi=((double)omosa)/((double)(takasa*takasa));

          if(bmi>25) {
        	  himan.add(number);
          }

      }

    }catch (IOException e) {
    	System.out.println("ioe");
        System.exit(0);
      }
      catch(NumberFormatException e) {
    	  System.out.println("num");
        System.exit(0);
      }

      catch(NullPointerException e) {
    	  System.out.println("nup");
        System.exit(0);
      }

    catch(NoSuchElementException e) {

    	for(Integer a:himan) {
    		System.out.println(a);
    	}
      System.exit(0);
    }
  }
}
