import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int pageSize = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Map<String, List<Button>> pages = new HashMap<String, List<Button>>(pageSize*2);
		String currentPage = null;
		List<Button> currentButtons = null;
		
		
		for(int i = 0; i < pageSize; i++) {
			String pageName = sc.next();
			
			int buttonSize = sc.nextInt();
			List<Button> list = new LinkedList<Button>();
			for(int j = 0; j < buttonSize; j++) {
				list.add(new Button(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next()));
			}
			if(i == 0) {
				currentPage = pageName;
				currentButtons = list;
			}
			pages.put(pageName, list);
		}
		
		ListIterator<String> pageHistory = new LinkedList<String>().listIterator();
		pageHistory.add(currentPage);
		
		int actionCount = sc.nextInt();
		
		for(int i = 0; i < actionCount; i++) {
			String action = sc.next();
			if(action.equals("click")) {
				int cw = sc.nextInt();
				int ch = sc.nextInt();
			
				for(Button btn : currentButtons) {
					if(btn.beginX <= cw && cw <= btn.endX && btn.beginY <= ch &&ch <=  btn.endY) {
						currentPage = btn.to;
						currentButtons = pages.get(currentPage);
						while(pageHistory.hasNext()) {
							pageHistory.next();
							pageHistory.remove();
						}
						pageHistory.add(currentPage);
						break;
					}
				}
			}
			else if(action.equals("forward")) {
				if(pageHistory.hasNext()) {
					currentPage = pageHistory.next();
					currentButtons = pages.get(currentPage);
				}
			}
			else if(action.equals("back")) {
				pageHistory.previous();
				
				if(pageHistory.hasPrevious()) {
					currentPage = pageHistory.previous();
					currentButtons = pages.get(currentPage);
				}
				
				pageHistory.next();
			}
			else if(action.equals("show")) {
				System.out.println(currentPage);
			}
		}
	}
}

class Button {
	public String to;
	public int beginX;
	public int beginY;
	public int endX;
	public int endY;
	
	public Button(int beginX, int beginY, int endX, int endY, String to) {
		this.to = to;
		this.beginX = beginX;
		this.beginY = beginY;
		this.endX = endX;
		this.endY = endY;
	}
}