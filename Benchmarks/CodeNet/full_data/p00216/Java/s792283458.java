import java.io.*;

public class Main {
    public static void main(String[] args) {
	try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    String line = reader.readLine();
	    int w = Integer.parseInt(line);
	    int s;
	    if(w==-1)break;
	    if(w<=10) {
		s = 1150;
	    }else if(w<=20) {
		s=1150+125*(w-10);
	    }else if(w<=30) {
		s=1150+1250+140*(w-20);
	    }else {
		s=1150+1250+1400+160*(w-30);
	    }
	    int x = 4280-s;
	    System.out.println(x);
	}
        }catch(IOException e){
	    System.out.println(e);
        }
    }
}