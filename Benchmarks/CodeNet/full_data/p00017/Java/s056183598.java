import java.util.*;

class Main{
	private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]){

        while(scan.hasNext()){
            String line = scan.nextLine();
            for(int i = 0; i < 26; i++){
                String now="";
				StringBuffer sb = new StringBuffer();
                for(int j = 0; j < line.length(); j++){
					char cz = line.charAt(j);
					if(cz >= 'a' && cz <= 'z'){
                        sb.append((char)('a' + (cz - i - 'a') % 26));
                    } else{
						sb.append(cz);
					}
                }
				now = sb.toString();
				boolean flag = false;
                for(int j = 0; j < now.length() - 2; j++){
					char cs = now.charAt(j);
					char cs1 = now.charAt(j + 1);
					char cs2 = now.charAt(j + 2);
                    if(cs == 't' && cs1 == 'h' && cs2 == 'e'){
						flag = true;
						break;
					}
                }
                for(int j = 0; j < now.length() - 3; j++){
					char cs = now.charAt(j);
					char cs1 = now.charAt(j + 1);
					char cs2 = now.charAt(j + 2);
					char cs3 = now.charAt(j + 3);
                    if(cs == 't' && cs1 == 'h'){
                        if(cs2 == 'i' && cs3 == 's'){
							flag = true;
							break;
						}
                        if(cs2 == 'a' && cs3 == 't'){
							flag = true;
							break;
						}
                    }
                }
                if(flag){
                    System.out.printf("%s\n", now);
                    break;
                }
            }
        }
    }
}