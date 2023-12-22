import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

class pck0075{

  public static void main(String[] args){

    BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
    String str="";
    StringTokenizer stk;
    int number;
    double omosa,takasa;

    try{

      while(true) {
    	  str=bfr.readLine();
    	  stk=new StringTokenizer(str,",");
          number=Integer.parseInt(stk.nextToken());
          omosa=Double.parseDouble(stk.nextToken());
          takasa=Double.parseDouble(stk.nextToken());

          double bmi=((double)omosa)/((double)(takasa*takasa));

          if(bmi>25) {
        	 System.out.println(number);
          }
          else {}
      }

    }catch (IOException e) {
        System.exit(0);
      }
      catch(NumberFormatException e) {
        System.exit(0);
      }

      catch(NullPointerException e) {

        System.exit(0);
      }

    catch(NoSuchElementException e) {

      System.exit(0);
    }
  }
}
