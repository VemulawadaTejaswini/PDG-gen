import java.util.Scanner;

class Gene {
	final String GENESIS_GENE = "ABC"; // ?????????????§??????????
	int compareGeneNum = 0;
	String copyGene = GENESIS_GENE;
	String compareGene = null;
	String operateGene = null;

	void createGene() {
		Scanner sc = new Scanner(System.in);
		compareGene = sc.nextLine();
		compareGeneNum = compareGene.length();

		sc.close();
	}

	int operateGene() {
		boolean ope1 = false;
		boolean ope2 = false;
		boolean ope3 = false;

		ope1 = typeA();
		if (ope1 == true){
			System.out.println("TypeA match!");
		}
		else{
			System.out.println("TypeA mismatch.");
		}
		copyGene = GENESIS_GENE;

		ope2 = typeB();
		if (ope2 == true){
			System.out.println("TypeB match!");
		}
		else{
			System.out.println("TypeB mismatch.");
		}
		copyGene = GENESIS_GENE;

		ope3 = typeC();
		if (ope3 == true)
			System.out.println("TypeC match!");
		else{
			System.out.println("TypeC mismatch.");
		}
		copyGene = GENESIS_GENE;

		if (ope1 == false && ope2 == false && ope3 == false) {
			return 1;
		} else
			return 2;
	}

	boolean typeA() {
		if(copyGene.equals(compareGene)){
			return true;
		}

		while(copyGene.length() < compareGene.length()){
			copyGene = copyGene.replaceAll("A", "ABC");
			if(copyGene.equals(compareGene)){
				return true;
			}
		}
		return false;
	}

	boolean typeB() {
		if(copyGene.equals(compareGene)){
			return true;
		}

		while(copyGene.length() < compareGene.length()){
			copyGene = copyGene.replaceAll("B", "ABC");
			if(copyGene.equals(compareGene)){
				return true;
			}
		}
		return false;
	}

	boolean typeC() {
		if(copyGene.equals(compareGene)){
			return true;
		}

		while(copyGene.length() < compareGene.length()){
			copyGene = copyGene.replaceAll("C", "ABC");
			if(copyGene.equals(compareGene)){
				return true;
			}
		}
		return false;
	}
}

public class Main {

	public static void main(String[] args) {
		Gene ge = new Gene();
		ge.createGene();
		if (ge.operateGene() == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}