import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            
            String line = br.readLine();
            String[] dataArray = line.split(" ");
            int x = Integer.parseInt(dataArray[0]);
            int y = Integer.parseInt(dataArray[1]);
            if(x<y) System.out.println(Result.LessThan.getValue());
            if(x==y) System.out.println(Result.Equal.getValue());
            if(x>y) System.out.println(Result.GreaterThan.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private static void processLine(String line) {
    // System.out.println(line);
    // }
   public enum Result{
    	LessThan("a < b"),
    	Equal("a == b"),
    	GreaterThan("a > b");
	   
		// ?????£??????????????????
	    private String name;
	    
	    // ??????????????????????????????
	    private Result(String name) {
	        this.name = name;
	    }
	    
	    // ????????????
        public String getValue() {
            return this.name;
        }
   };
}