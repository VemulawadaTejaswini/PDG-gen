import java.io.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    while((st = sc.readLine())!=null){
		for(int i=0; i<26; i++){
		    StringBuilder s = new StringBuilder();
		    for(int j=0; j<st.length(); j++){
			if((int)st.charAt(j)==' ')
			    s.append(" ");
			else if((int)st.charAt(j)=='.')
			    s.append(".");
			else{
			    int c = (int)st.charAt(j)+i;
			    char dd = (char)('a'+c%26);
			    s.append(dd);
			}
		    }
		    String sd = s.toString();
		    if(sd.matches("the(.*)") || sd.matches("this(.*)") || sd.matches("that(.*)"))
			System.out.println(sd);
		}
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}