
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author yoshkur
 */
public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputData inputData = new InputData(br);
			
			System.out.println(new SimpleDateFormat("h:m:s").format(inputData.getDate()));

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class InputData {

	private Date date;

	public InputData(BufferedReader br) throws IOException {
		String line = br.readLine().trim();
		Long second = Long.parseLong(line);
		date = new Date(TimeUnit.SECONDS.toMillis(second));
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}