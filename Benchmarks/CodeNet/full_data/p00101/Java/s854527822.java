import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int numberOfDataset = Integer.parseInt(br.readLine());
			String dataset = br.readLine();
			for(int i = 0; i < numberOfDataset; i++){
			dataset = dataset.replaceAll("Hoshino","Hoshina");
			System.out.println(dataset);
			dataset = br.readLine();
			}
		} catch (IOException e) {
			logger.info("Error:  Reading input data is failed.");
		}
	}
}