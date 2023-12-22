import java.util.Scanner;

class Main{

  public static void main(String[] args){

    //BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);
    String[] str;
    int number;
    double omosa,takasa;

      while(sc.hasNext()) {
    	  str=sc.next().split(",");
  		  number=Integer.parseInt(str[0]);
          omosa=Double.parseDouble(str[1]);
          takasa=Double.parseDouble(str[2]);

              double bmi=((double)omosa)/((double)(takasa*takasa));

              if(bmi>25) {
            	 System.out.println(number);
              }
              else {}
    	  }
   }
}
