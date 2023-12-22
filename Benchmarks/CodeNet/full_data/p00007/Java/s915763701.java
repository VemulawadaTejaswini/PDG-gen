import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            int deptWeek = Integer.parseInt(line);
            int dept = 100000;
            for(int i = 1; i < deptWeek; i++ ){
            	int checkDept = (int)Math.ceil(dept * 0.05);
            	String strCheckDept = String.valueOf(checkDept);
            	String num = strCheckDept.substring(strCheckDept.length() - 4, strCheckDept.length() - 3);
            	if(!num.equals("0")){
            		int numnum = Integer.parseInt(num);
            		checkDept = checkDept + 10000 - numnum;
            	}
            	dept = dept + checkDept;
            }
            System.out.println(dept); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }