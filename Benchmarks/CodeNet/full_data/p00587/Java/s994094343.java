import java.io.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while((line=r.readLine())!=null){
				String[] vars = line.split(" ");
				String res = "";
				if (vars[0].indexOf('i')>=0){//intersection
					res = intersection(vars[1],vars[2]);
				} else {//union
					res = union(vars[1],vars[2]);
				}
				
				System.out.println(res);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String[] child(String a){//return left and right child
		String[] children = new String[2];
		int index = 1, level=0;
		while(true){
			if(a.charAt(index)=='('){
				level++;
			} else if (a.charAt(index)==')'){
				level--;
			} else if (a.charAt(index)==','&&level==0){
				children[0] = a.substring(1,index);
				children[1] = a.substring(index+1,a.length()-1);
				return children;
			}
			index++;
		}
	}
	
	public static String intersection(String a, String b){
		if(a.length()==0||b.length()==0){
			return "";
		} else {
			return "(" + intersection(child(a)[0],child(b)[0]) + "," + intersection(child(a)[1],child(b)[1]) + ")";
		}
	}
	
	public static String union(String a, String b){
		if(a.length()==0&&b.length()==0){
			return "";
		} else if (a.length()==0){
			return "(" + child(b)[0] + "," + child(b)[1] + ")"; 
		} else if (b.length()==0){
			return "(" + child(a)[0] + "," + child(a)[1] + ")";
		} else {
			return "(" + union(child(a)[0],child(b)[0]) + "," + union(child(a)[1],child(b)[1]) + ")";
		}
	}
}