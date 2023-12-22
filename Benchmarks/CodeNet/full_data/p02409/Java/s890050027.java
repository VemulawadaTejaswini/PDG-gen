import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int count = 0;
            int n = 0;
            
            // ????????????????????????????????????
            OfficialHouse oH1 = new OfficialHouse(1);
            OfficialHouse oH2 = new OfficialHouse(2);
            OfficialHouse oH3 = new OfficialHouse(3);
            OfficialHouse oH4 = new OfficialHouse(4);
            
            while((line = stdReader.readLine()) != null) {
                // ****************************************
                // ???????????????????????°
                // ****************************************
                if(count == 0) {
                    n = Integer.parseInt(line);
                    
                    count++;
                    continue;
                }
                // ****************************************
                // ???????????\??????????????????????¨?
                // ****************************************
                String[] inData = line.split(" ", 0);
                // ?£???????
                int b = Integer.parseInt(inData[0]);
                // ???
                int f = Integer.parseInt(inData[1]);
                // ??¨?±???????
                int r = Integer.parseInt(inData[2]);
                // ?????°
                int v = Integer.parseInt(inData[3]);
                
                // ?£?????????§??????
                switch(b) {
                    case 1:
                        oH1.managementResident(f, r, v);
                        break;
                    case 2:
                        oH2.managementResident(f, r, v);
                        break;
                    case 3:
                        oH3.managementResident(f, r, v);
                        break;
                    case 4:
                        oH4.managementResident(f, r, v);
                        break;
                }
                
                if(count == n) {
                    oH1.showResidentCount();
                    System.out.println("####################");
                    oH2.showResidentCount();
                    System.out.println("####################");
                    oH3.showResidentCount();
                    System.out.println("####################");
                    oH4.showResidentCount();
                    
                    count = 0;
                    continue;
                }
                
                count++;
            
            }
            stdReader.close();
        } catch(Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}

class OfficialHouse {
    // ********************************
    // ?????£?????????
    // ********************************
    int buildingNumber;
    int floorNumber = 3;
    int roomNumber  = 10;
    int[][] residentCount;
    
    // ********************************
    // ?????????????????????
    // ********************************
    OfficialHouse(int bN) {
        // ?£???????????±????
        buildingNumber = bN;
        
        // ??\?±??????????????????????????????????
        residentCount = new int[floorNumber][roomNumber];
        
        // ??????????????\?±??????°??????????????????
        for(int f = 0; f < floorNumber; f++) {
            for(int r = 0; r < roomNumber; r++) {
                residentCount[f][r] = 0;
            }
        }
    }
    
    // *******************************
    // ????????????
    // *******************************
    // ??\?±?????????????
    public void managementResident(int fN, int rN, int rC) {
        residentCount[fN-1][rN-1] += rC;
        
        // ??\?±???????0?????????????????´??????0??§??¢??????
        if(residentCount[fN-1][rN-1] < 0) {
            residentCount[fN-1][rN] = 0;
        }
        
        // ??\?±???????10?????\??????????????´??????9????????????
        if(residentCount[fN-1][rN-1] > 9) {
            residentCount[fN-1][rN] = 9;
        }
    }
    
    // ??\?±?????????¨???
    public void showResidentCount() {
        for(int f = 0; f < floorNumber; f++) {
            for(int r = 0; r < roomNumber; r++) {
                System.out.print(" " + residentCount[f][r]);
                
            }
            System.out.println();
        }
    }
}