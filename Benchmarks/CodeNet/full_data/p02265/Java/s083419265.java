
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main{

	public static void main(String[] args) {

		try {
			List<String> list = new ArrayList<String>();
			BufferedReader r =
                new BufferedReader(new InputStreamReader(System.in), 1);
			String strInput = r.readLine();
			String[] strcmd;
			int loopmax = Integer.parseInt(strInput);

			for(int i=0;i<loopmax;i++) {
				strInput = r.readLine();
				strcmd = strInput.split(" ");

				if(strcmd[0].equals("insert")) {
					list.add(0,strcmd[1]);
				}else if(strcmd[0].equals("deleteFirst")) {
					list.remove(0);
				}else if(strcmd[0].equals("deleteLast")) {
					list.remove(list.size()-1);
				}else if(strcmd[0].equals("delete")) {
					if(list.indexOf(strcmd[1])>=0){
						list.remove(list.indexOf(strcmd[1]));
					}
				}
			}

			StringBuffer sb = new StringBuffer();
			for(int i=0;i<list.size();i++) {
				sb.append(list.get(i));
			}
			sb.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

