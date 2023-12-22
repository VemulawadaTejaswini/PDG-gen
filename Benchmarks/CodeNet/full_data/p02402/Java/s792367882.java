/*
 * Aizu Online Judge
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yoshkur
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataController controller = new DataController();
			controller.setDataFromLine(br);
			br.close();
			System.out.println(controller.getResult());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class DataService {

	private List<DataEntity> entities = new ArrayList<>();
	private DataEntity entity;

	public DataService() {
	}

	public List<DataEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<DataEntity> entities) {
		this.entities = entities;
	}

	public DataEntity getEntity() {
		if (this.entity == null) {
			this.entity = new DataEntity();
		}
		return entity;
	}

	public void setEntity(DataEntity entity) {
		this.entity = entity;
	}
}

class DataEntity {
	private Integer number;

	public DataEntity() {
	}

	public DataEntity(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}

class DataController {

	private static final String RETCODE = System.getProperty("line.separator");
	public static final String SEPARATOR = " ";

	private final DataService ejb;

	public DataController() {
		this.ejb = new DataService();
	}

	public void setDataFromLine(BufferedReader br) throws IOException {
		Integer count = Integer.valueOf(br.readLine().trim());
		String[] values = br.readLine().trim().split(SEPARATOR);
		for (String str : values) {
			this.ejb.getEntities().add(new DataEntity(Integer.valueOf(str)));
		}
	}

	public void setDataFromLines(BufferedReader br) throws IOException {
		String line;
		while ((line = br.readLine()) != null) {
//			DataEntity entity = new DataEntity();
//			String[] values = line.trim().split(SEPARATOR);
//			entity.setNum0(Integer.valueOf(values[0]));
//			entity.setNum1(Integer.valueOf(values[1]));
//			this.ejb.getEntities().add(entity);
		}
	}

	public String getResult() {
		String result = null;
		Integer min = 1000000;
		Integer max = -1000000;
		Long sum = 0L;
		
		for (DataEntity entity : this.ejb.getEntities()) {
			min = Math.min(min, entity.getNumber());
			max = Math.max(max, entity.getNumber());
			sum += entity.getNumber();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(min);
		sb.append(SEPARATOR);
		sb.append(max);
		sb.append(SEPARATOR);
		sb.append(sum);
		result = sb.toString().trim();
		return result;
	}
}