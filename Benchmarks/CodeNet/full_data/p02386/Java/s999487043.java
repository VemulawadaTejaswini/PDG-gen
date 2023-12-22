import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	DiceCtrl dc = new DiceCtrl();
    	
    	int n = sc.nextInt();
    	for(int i = 0; i < 6; i++) {
    		dc.numList[i] = sc.nextInt();
    	}
    	for(int i = 0; i < n - 1; i++) {
    		for(int j = 0; j < 6; j++) {
    			dc.numList2[j] = sc.nextInt();
    		}
    		dc.diceCheck();
    	}
    	System.out.println(dc.result);
    }
}

class DiceCtrl {
	public int[] numList = new int[6];
	public int[] numList2 = new int[6];
	private int tmp = 0;
	public String result = "Yes";
	
	void ctrlE() {
		tmp = numList[0];
		numList[0] = numList[3];
		numList[3] = numList[5];
		numList[5] = numList[2];
		numList[2] = tmp;
	}
	void ctrlN() {
		tmp = numList[0];
		numList[0] = numList[1];
		numList[1] = numList[5];
		numList[5] = numList[4];
		numList[4] = tmp;
	}
	void ctrlS() {
		tmp = numList[0];
		numList[0] = numList[4];
		numList[4] = numList[5];
		numList[5] = numList[1];
		numList[1] = tmp;
	}
	void ctrlW() {
		tmp = numList[0];
		numList[0] = numList[2];
		numList[2] = numList[5];
		numList[5] = numList[3];
		numList[3] = tmp;
	}
	void ctrlR() {
		tmp = numList[1];
		numList[1] = numList[2];
		numList[2] = numList[4];
		numList[4] = numList[3];
		numList[3] = tmp;
	}
	void diceCheck() {
		for(int i = 0; i < 4; i++) {
			if(boolCheck()) {
				break;
			}
			ctrlN();
			for(int j = 0; j < 4; j++) {
				if(boolCheck()) {
					break;
				}
				ctrlR();
			}
		}
		for(int i = 0; i < 4; i++) {
			if(boolCheck()) {
				break;
			}
			ctrlW();
			for(int j = 0; j < 4; j++) {
				if(boolCheck()) {
					break;
				}
				ctrlR();
			}
		}
		if(Arrays.equals(numList, numList2)) {
			result = "No";
		}
	}
	boolean boolCheck() {
		if(numList[0] == numList2[0] &&
		   numList[1] == numList2[1] &&
		   numList[2] == numList2[2] &&
		   numList[3] == numList2[3] &&
		   numList[4] == numList2[4] &&
		   numList[5] == numList2[5]) {
			return true;
		} else {
			return false;
		}
	}
}