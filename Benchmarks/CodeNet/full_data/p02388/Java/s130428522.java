public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int x,a;
            System.out.println("Input x:");
            String line = reader.readLine();
            x = Integer.parseInt(line);
            a = x*x*x;
	        System.out.println("x^3="+a);

        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
System.out.println("The input number was not correct.");

        }
    }
}

