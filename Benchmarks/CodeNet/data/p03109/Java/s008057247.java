public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      	String sdate = sc.next();
      
      	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

        Date formatDate = sdf.parse(sdate);

      	if(formatDate <= 2019/04/30){
        	System.out.println("Heisei");
        }else{
        	System.out.println("TBD");
        } 
    }
};