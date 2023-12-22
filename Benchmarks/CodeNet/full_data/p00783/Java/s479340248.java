import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String str = sc.nextLine();
	    str = str.replace(':', ' ').replace('\'', ' ').replace('"',' ');
	    str = str.replace('.', ' ').replace(',', ' ');
	    str = str.toUpperCase();
	    String[] st = str.split(" ");
	    str = "";
	    for(int i = 0; i < st.length; i++){
		str += st[i];
	    }
	    String[] stt = new String[1024];
	    int p = 0;

	    for(int i = str.length(); i > 1; i--){
		for(int j = 0; j+i <= str.length(); j++){
		    String str2 = str.substring(j, j+i);
		    char[] ch = str2.toCharArray();
		    boolean f = true;
		    for(int s = 0, t = str2.length()-1; s < t; s++, t--){
			if(ch[s] != ch[t]){
			    f = false;
			    break;
			}
		    }
		    if(f){
			for(int k = 0; k < p; k++){
			    int l1 = stt[k].length(), l2 = str2.length();
			    if(l1%2 == l2%2){
				if(l1 > l2){
				    l1 = (l1-l2)/2;
				    if(str2.equals(stt[k].substring(l1, l1+l2))){
					f = false;
					break;
				    }
				} else if(l1 == l2){
				    if(str2.equals(stt[k])){
					f = false;
					break;
				    }
				}
			    }
			}
			if(f){
			    stt[p++] = str2;
			}
		    }
		}
	    }

	    if(p > 0){
		System.out.print(stt[0]);
		for(int i = 1; i < p; i++){
		    System.out.print(" "+stt[i]);
		}
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}