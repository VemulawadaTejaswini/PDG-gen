import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(""+br.readLine());
			String Dic[] = new String[n];
			String cmd[];
			for(int i=0, j=0; i<n; i++){
				cmd = br.readLine().split(" ", 0);
				if(cmd[0].equals("insert")){
					Dic[j] = cmd[1];
					j++;
				} else if(cmd[0].equals("find")){
					int k;
					for(k=0; k<j; k++){
						if(cmd[1].equals(Dic[k])){
							System.out.println("yes");
							break;
						}
					}
					if(k==j) System.out.println("no");
				}
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}